package questions_26_50;

class Tool implements Exportable {
    public void export() { // protected replace with public will work
        System.out.println("Tool");
    }
}

public class ReportTool33 extends Tool implements Exportable {
    public void export() {
        System.out.println("ReportTool");

    }

    public static void main(String[] args) {
        Tool aToll = new ReportTool33();
        Tool btool = new Tool();
        callExport(aToll);
        callExport(btool);
    }

    public static void callExport(Exportable ex) {
        ex.export();
    }
}

interface Exportable {
    void export();
}