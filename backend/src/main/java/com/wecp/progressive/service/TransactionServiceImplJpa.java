package com.wecp.progressive.service;

import com.wecp.progressive.entity.Transactions;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class TransactionServiceImplJpa implements TransactionService {

    @Override
    public List<Transactions> getAllTransactions() throws SQLException {
        return null;
    }

    @Override
    public Transactions getTransactionById(int transactionId) throws SQLException {
        return null;
    }

    @Override
    public int addTransaction(Transactions transaction) throws SQLException {
        return 0;
    }

    @Override
    public void updateTransaction(Transactions transaction) throws SQLException {

    }

    @Override
    public void deleteTransaction(int transactionId) throws SQLException {

    }

    @Override
    public List<Transactions> getTransactionsByCustomerId(int customerId) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTransactionsByCustomerId'");
    }
}
