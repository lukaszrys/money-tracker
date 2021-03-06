package com.vegesoft.moneytracker.account.handler.mapper;

import com.vegesoft.moneytracker.account.client.data.ExpenseRequest;
import com.vegesoft.moneytracker.account.client.data.IncomeRequest;
import com.vegesoft.moneytracker.account.command.AddBalanceCommand;
import com.vegesoft.moneytracker.account.command.SubtractBalanceCommand;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.stereotype.Component;

@Component
public class BalanceCommandMapper {

    public ExpenseRequest expenseRequest(final UUID uuid, final SubtractBalanceCommand subtractBalanceCommand) {
        return new ExpenseRequest(subtractBalanceCommand.getAmount(), subtractBalanceCommand.getExpenseType(), uuid,
            LocalDateTime.now());
    }

    public IncomeRequest incomeRequest(final UUID uuid, final AddBalanceCommand addBalanceCommand) {
        return new IncomeRequest(addBalanceCommand.getAmount(), uuid, LocalDateTime.now());
    }
}
