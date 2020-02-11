package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class BankService {

    /**
     * Все пользователи системы.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавление пользователя в систему.
     * @param user новый пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Добавление нового счета к пользователю.
     * @param passport паспортные данные
     * @param account счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!users.get(user).contains(account)) {
            users.get(user).add(account);
        }
    }

    /**
     * Поиск пользователя по пасспорту.
     * @param passport паспортные данные
     * @return пользователь
     */
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user: users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
            }
        }
        return rsl;
    }

    /**
     * Поиск пользователя по реквизитам.
     * @param passport паспортные данные
     * @param requisite реквизиты
     * @return счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account rsl = null;
        for (Account account: users.get(user)) {
            if (account.getRequisite().equals(requisite)) {
                rsl = account;
            }
        }
        return rsl;
    }

    /**
     * Перевод денег с одного счета на другой.
     * @param srcPassport паспортные данные адресанта
     * @param srcRequisite реквизиты адресанта
     * @param destPassport паспортные данные адресата
     * @param destRequisite реквизиты адресата
     * @param amount сумма денежного перевода
     * @return результат операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account destAccount = findByRequisite(destPassport, destRequisite);
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);

        if (srcAccount.getBalance() >= amount) {
            destAccount.setBalance(destAccount.getBalance() + amount);
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            rsl = true;
        }
        return rsl;
    }
}