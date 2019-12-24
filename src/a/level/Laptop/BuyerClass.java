package a.level.Laptop;

public class BuyerClass {
    private String LaptopName;
    private Double ScreenSize;
    private String ProcessorType;
    private Double Price;
    private Integer TheNumberOfProcessorCores;
    private Integer RAMSize;
    private Integer SSDCapacity;
    private Integer HDDCapacity;

    public BuyerClass() {

    }

    public BuyerClass(String LaptopName, Double Price, Double ScreenSize, String ProcessorType, Integer TheNumberOfProcessorCores, Integer RAMSize, Integer SSDCapacity, Integer HDDCapacity) {
        this.LaptopName = LaptopName;
        this.ScreenSize = ScreenSize;
        this.ProcessorType = ProcessorType;
        this.TheNumberOfProcessorCores = TheNumberOfProcessorCores;
        this.RAMSize = RAMSize;
        this.SSDCapacity = SSDCapacity;
        this.Price = Price;
        this.HDDCapacity = HDDCapacity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }


    public Double getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(Double screenSize) {
        ScreenSize = screenSize;
    }

    public String getProcessorType() {
        return ProcessorType;
    }

    public void setProcessorType(String processorType) {
        ProcessorType = processorType;
    }

    public String getLaptopName() {
        return LaptopName;
    }

    public void setLaptopName(String laptopName) {
        LaptopName = laptopName;
    }

    public Integer getTheNumberOfProcessorCores() {
        return TheNumberOfProcessorCores;
    }

    public void setTheNumberOfProcessorCores(Integer theNumberOfProcessorCores) {
        TheNumberOfProcessorCores = theNumberOfProcessorCores;
    }

    public Integer getRAMSize() {
        return RAMSize;
    }

    public void setRAMSize(Integer RAMSize) {
        this.RAMSize = RAMSize;
    }

    public Integer getSSDCapacity() {
        return SSDCapacity;
    }

    public void setSSDCapacity(Integer SSDCapacity) {
        this.SSDCapacity = SSDCapacity;
    }

    public Integer getHDDCapacity() {
        return HDDCapacity;
    }

    public void setHDDCapacity(Integer HDDCapacity) {
        this.HDDCapacity = HDDCapacity;
    }
}
