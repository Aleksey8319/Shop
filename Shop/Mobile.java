package Shop;

/* Принцип разделения - используем несколько интерфейсов вместо одного большого
    Принцип инверсии зависимостей - зависимость от абстракции */
class Mobile extends Product implements Clock, SMSer{
    private final String name = "мобильник";
    private final double price = 25000;
    private String time;

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void setAlarm(String time) {
        if (this.time.equals(time)) {
            System.out.println("Пора вставать!");
        }
    }

    @Override
    public void sendSMS(String msg, String number) {
        if (number.isEmpty()) {
            System.out.println(msg);
        }
    }
}
