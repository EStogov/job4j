package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
    }

    @Test
    public void whenAccountAlreadyExistsThenThrowIAE() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        Account account = new Account("5546", 150);
        bank.addAccount(user.getPassport(), account);
        try {
            bank.addAccount("3434", account);
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("Such account already exists"));
        }
    }

    @Test
    public void whenThereIsNoSuchAccountThenThrowIAE() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        try {
            bank.findByRequisite("3434", "5546");
        } catch (IllegalArgumentException e) {
            assertThat(e.getMessage(), is("Such user doesn't exist"));
        }
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150));
        bank.addAccount(user.getPassport(), new Account("113", 50));
        bank.transferMoney(user.getPassport(), "5546", user.getPassport(), "113", 150);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(200.0));
    }
}