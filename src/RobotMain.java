import TI.*;
public class RobotMain {
    public static Servo svl = new Servo(12);
    public static Servo svr = new Servo(13);



    public static void main(String[] args) {
        System.out.println("spoorzoeken...");
        svl.update(1520);
        svr.update(1480);
        while (true) {
            int waardeR = BoeBot.analogRead(0);
            int waardeM = BoeBot.analogRead(1);
            int waardeL = BoeBot.analogRead(2);
            /*System.out.println("Analoge Waarde Rechts: " + waardeR);
            System.out.println("Analoge Waarde Midden: " + waardeM);
            System.out.println("Analoge Waarde Links: " + waardeL);
            BoeBot.wait(10);*/
            richting(waardeR, waardeM, waardeL);

        }
    }

    public static void noodRem() {
        svl.update(1500);
        svr.update(1500);
        BoeBot.wait(50);
    }

    public static void richting(int waardeR, int waardeM, int waardeL) {
        if (waardeR > 200 && waardeM <= 200 && waardeL <= 200) {
            svl.update(1550);
            svr.update(1500);
            BoeBot.wait(25);
        }
        if (waardeR > 200 && waardeM > 200 && waardeL <= 200) {
            svl.update(1525);
            svr.update(1500);
            BoeBot.wait(20);
        }
        if (waardeR <= 200 && waardeM <= 200 && waardeL > 200) {
            svl.update(1500);
            svr.update(1450);
            BoeBot.wait(25);
        }
        if (waardeR <= 200 && waardeM > 200 && waardeL > 200) {
            svl.update(1500);
            svr.update(1475);
            BoeBot.wait(20);
        }
        /*if (waardeR <= 200 && waardeM <= 200 && waardeL <= 200) {
            svl.update(1475);
            svr.update(1525);
            BoeBot.wait(1000);
        }
        if (waardeR > 200 && waardeM > 200 && waardeL > 200) {
            svl.update(1475);
            svr.update(1525);
            BoeBot.wait(1000);
        }*/
        if (waardeR <= 200 && waardeM > 200 && waardeL <= 200) {
            svl.update(1525);
            svr.update(1475);
        }
        if (waardeR > 200 && waardeM <= 200 && waardeL > 200) {
            noodRem();
        }
    }
}
