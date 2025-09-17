package Shop;

public class SMSer implements Message{

    //Принцип инверсии зависимостей - зависимость от абстракции
    @Override
    public void send(String msg) {
        System.out.println("Отправлено SMS сообщение: " + msg);
    }
}
