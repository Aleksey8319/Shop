package Shop;

// Принцип разделения - используем несколько интерфейсов вместо одного большого

class Mobile extends Product implements Clock, Device{
    private final String name = "мобильник";
    private final double price = 25000;
    private String time;
    private Message sms;

    public void setTime(String time) {
        this.time = time;
    }

    //Принцип инверсии зависимостей - зависимость от абстракции
    public void sendSms (Message sms, String msg) {
        this.sms = sms;
        sms.send(msg);
    }

    @Override
    public void Alarm() {
        if (time.equals("07:00")) {
            System.out.println("Пора вставать!");
        }
    }

    @Override
    public void enable() {
        System.out.println("Включен");
    }



}

