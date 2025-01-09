public class AsusManufacturer extends Company{
    @Override
    public GPU createGpu() {
        return new AsusGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
