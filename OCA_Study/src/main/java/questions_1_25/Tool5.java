package questions_1_25;

interface Exportable{
    void export();
}

class Tool5 implements Exportable{

    @Override
     public void export() {
        System.out.println("Tool::export");
    }
}
class ReportTool extends Tool5{

    // public yazmayinca hata veriyor
    public void export(){
        System.out.println("Rtool::export");
    }

    public static void main(String[] args) {
        Tool5 a=new ReportTool();
        Tool5 b=new Tool5();
        callExport(a);
        callExport(b);

//        ReportTool c=new ReportTool();
//        callExport(c);
    }
    public static void callExport(Exportable e){
        e.export();
    }
}
