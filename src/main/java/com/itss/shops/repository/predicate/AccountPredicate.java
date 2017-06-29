package com.itss.shops.repository.predicate;

import com.itss.shops.entity.QAccount;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.BooleanExpression;

public class AccountPredicate {

    public static Predicate findUser(String searchText, Boolean isShowInactive) {
        QAccount user = QAccount.account;
        BooleanExpression boolExpression;
        boolExpression = user.id.gt(0);

        if (searchText != null && !searchText.isEmpty()) {
            boolExpression = boolExpression.
                    andAnyOf(user.userName.like("%" + searchText + "%"),
                            user.fullName.like("%" + searchText + "%"));
        }
        return boolExpression;
    }

}
