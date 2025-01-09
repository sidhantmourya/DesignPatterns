public class Main {

    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        GPU gpu = msi.createGpu();
        Monitor mon = msi.createMonitor();

        gpu.assemble();
        mon.assemble();

        Company asus = new AsusManufacturer();
        GPU asusGpu = asus.createGpu();
        Monitor asusMonitor = asus.createMonitor();

        asusGpu.assemble();
        asusMonitor.assemble();
    }
}
