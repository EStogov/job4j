package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUI {
    /**
     * Константа меню для добавления новой заявки.
     */
    private static final String ADD = "0";

    /**
     * Константа меню для показа всех заявок.
     */
    private static final String SHOW = "1";

    /**
     * Константа меню для редактирования заявки.
     */
    private static final String EDIT = "2";

    /**
     * Константа меню для удаления заявки.
     */
    private static final String DELETE = "3";

    /**
     * Константа меню для поиска заявки по Id.
     */
    private static final String FINDBYID = "4";

    /**
     * Константа меню для поиска заявки по имени.
     */
    private static final String FINDBYNAME = "5";

    /**
     * Константа для выхода из цикла.
     */
    private static final String EXIT = "6";
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
            } else if (SHOW.equals(answer)) {
                this.showItems();
            } else if (EDIT.equals(answer)) {
                this.editItem();
            } else if (DELETE.equals(answer)) {
                this.deleteItem();
            } else if (FINDBYID.equals(answer)) {
                this.findById();
            } else if (FINDBYNAME.equals(answer)) {
                this.findByName();
            } else if (EXIT.equals(answer)) {
                exit = true;
            }
        }
    }

    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */

    private void createItem() {
        System.out.println();
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        this.tracker.add(item);
        System.out.println("------------ Id новой заявки : " + item.getId() + " -----------");
    }

    /**
     * Метод для вывода на экран списка всех заявок.
     */

    private void showItems() {
        System.out.println();
        System.out.println("------------ Список заявок --------------");
        Item[] list = this.tracker.findAll();
        String ln = System.lineSeparator();
        for (Item item : list) {
            System.out.println("Id заявки: " + item.getId() + ln
                    + "Название: " + item.getName() + ln
                    + "Описание: " + item.getDecs() + ln
                    + "Время создания: " + item.getTime() + ln);
        }
    }

    /**
     * Метод для редактирования заявки.
     */

    private void editItem() {
        System.out.println();
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("------------ Введите Id заявки --------------");
        if (this.tracker.findById(id) == null) {
            System.out.println("Заявка не найдена");
        } else {
            System.out.println("------------ Редактирование заявки №" + id + " --------------");
            String name = this.input.ask("Введите название заявки :");
            String desc = this.input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, System.currentTimeMillis());
            this.tracker.replace(id, item);
            System.out.println("------------ Заявка успешно изменена --------------");
        }
    }

    /**
     * Метод для удаления заявки.
     */

    private void deleteItem() {
        System.out.println();
        System.out.println("------------ Удаление заявки --------------");
        String id = this.input.ask("------------ Введите Id заявки --------------");
        String ln = System.lineSeparator();
        String answer = this.input.ask("Вы точно хотите удалить заявку под номером: " + id + "?" + ln
                + "0. Да." + ln
                + "1. Нет.");
        if (answer.equals("0")) {
            if (this.tracker.delete(id)) {
                System.out.println("------------ Заявка №" + id + " удалена --------------");
            } else {
                System.out.println("------------ Заявка № не найдена --------------");
            }
        } else {
            String newAnswer = this.input.ask(ln + "0. Вернуться в основное меню." + ln + "1. Удалить другую заявку.");
            if (newAnswer.equals("1")) {
                deleteItem();
            }
        }
    }

    /**
     * Метод поиска по Id заявки.
     */

    private void findById() {
        System.out.println();
        String id = this.input.ask("------------ Введите Id заявки --------------");
        Item item = this.tracker.findById(id);
        String ln = System.lineSeparator();
        if (item == null) {
            System.out.println("------------ Заявка №" + id + " не найдена --------------");
        } else {
            System.out.println("Id заявки: " + item.getId() + ln
                    + "Название заявки: " + item.getName() + ln
                    + "Описание: " + item.getDecs() + ln
                    + "Время оформления: " + item.getTime() + ln);
        }
    }

    /**
     * Метод для поиска по названию заявки.
     */

    private void findByName() {
        System.out.println();
        String name = this.input.ask("------------ Введите название заявки --------------");
        Item[] items = this.tracker.findByName(name);
        String ln = System.lineSeparator();
        for (Item item : items) {
            System.out.println("Id заявки: " + item.getId() + ln
                    + "Название заявки: " + item.getName() + ln
                    + "Описание: " + item.getDecs() + ln
                    + "Время оформления: " + item.getTime() + ln);
        }
    }

    /**
     * Метод вывода на экран основного меню выбора.
     */

    private void showMenu() {
        System.out.println();
        System.out.println("Меню.");
        System.out.println("0. Добавить заявку.");
        System.out.println("1. Показать все заявки.");
        System.out.println("2. Редактировать заявку.");
        System.out.println("3. Удалить заявку.");
        System.out.println("4. Найти по Id.");
        System.out.println("5. Найти по названию.");
        System.out.println("6. Выход.");
    }

    /**
     * Запускт программы.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}