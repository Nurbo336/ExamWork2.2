public class ContactManagerApp {
    public static void main(String[] args){
        BasicContactManager basicContactManager = new BasicContactManager();
        System.out.println("***********МЕНЮ***************");
        System.out.println("*1 - Создать новый контакт    *");
        System.out.println("*2 - Просмотр контактов       *");
        System.out.println("*3 - Обновить контакты        *");
        System.out.println("*4 - Удалить контакты         *");
        System.out.println("*5 - Выход                    *");
        System.out.print("********************************");
        basicContactManager.action();
    }
}