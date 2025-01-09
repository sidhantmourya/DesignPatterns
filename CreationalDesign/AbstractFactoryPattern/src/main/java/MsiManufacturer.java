public class MsiManufacturer extends Company{
    @Override
    public GPU createGpu() {
        return new MsiGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
