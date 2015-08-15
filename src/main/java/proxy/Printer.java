package proxy;

/**
 * Created by yoon on 15. 8. 15..
 */
public class Printer implements Printable {
    private String name;
    public Printer() {
        heavyJob("Printer의 인스턴스를 생성 중");
    }
    public Printer(String name) {                   // »ý¼ºÀÚ
        this.name = name;
        heavyJob("Printer의 인스턴스 (" + name + ")을 생성 중");
    }
    public void setPrinterName(String name) {       // ÀÌ¸§ÀÇ ¼³Á¤
        this.name = name;
    }
    public String getPrinterName() {                // ÀÌ¸§ÀÇ Ãëµæ
        return name;
    }
    public void print(String string) {              // ÀÌ¸§À» ºÙ¿©¼­ Ç¥½Ã
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }
    private void heavyJob(String msg) {             // ¹«°Å¿î ÀÛ¾÷
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.print(".");
        }
        System.out.println("완료.");
    }
}