package a.level.Laptop;

public class ManufacturerClass {
    private String LaptopName;
    private String DisplayType;
    private String BodyMaterial;
    private String KeyboardLanguage;
    private Double CPUBaseFrequency;
    private Double CPUMaximumFrequency;
    private String WiFi;
    private Double Length;
    private Double Width;
    private Double Thickness;
    private Double Weight;

    public ManufacturerClass(String LaptopName, String DisplayType, String BodyMaterial, String KeyboardLanguage, Double CPUBaseFrequency, Double CPUMaximumFrequency, String WiFi, Double Length, Double Width, Double Thickness, Double Weight) {
        this.LaptopName = LaptopName;
        this.DisplayType = DisplayType;
        this.BodyMaterial = BodyMaterial;
        this.KeyboardLanguage = KeyboardLanguage;
        this.CPUBaseFrequency = CPUBaseFrequency;
        this.CPUMaximumFrequency = CPUMaximumFrequency;
        this.WiFi = WiFi;
        this.Length = Length;
        this.Width = Width;
        this.Thickness = Thickness;
        this.Weight = Weight;
    }

    public String getLaptopName() {
        return LaptopName;
    }

    public void setLaptopName(String laptopName) {
        LaptopName = laptopName;
    }

    public String getDisplayType() {
        return DisplayType;
    }

    public void setDisplayType(String displayType) {
        DisplayType = displayType;
    }

    public String getBodyMaterial() {
        return BodyMaterial;
    }

    public void setBodyMaterial(String bodyMaterial) {
        BodyMaterial = bodyMaterial;
    }

    public String getKeyboardLanguage() {
        return KeyboardLanguage;
    }

    public void setKeyboardLanguage(String keyboardLanguage) {
        KeyboardLanguage = keyboardLanguage;
    }

    public Double getCPUBaseFrequency() {
        return CPUBaseFrequency;
    }

    public void setCPUBaseFrequency(Double CPUBaseFrequency) {
        this.CPUBaseFrequency = CPUBaseFrequency;
    }

    public Double getCPUMaximumFrequency() {
        return CPUMaximumFrequency;
    }

    public void setCPUMaximumFrequency(Double CPUMaximumFrequency) {
        this.CPUMaximumFrequency = CPUMaximumFrequency;
    }

    public String getWiFi() {
        return WiFi;
    }

    public void setWiFi(String wiFi) {
        WiFi = wiFi;
    }

    public Double getLength() {
        return Length;
    }

    public void setLength(Double length) {
        Length = length;
    }

    public Double getWidth() {
        return Width;
    }

    public void setWidth(Double width) {
        Width = width;
    }

    public Double getThickness() {
        return Thickness;
    }

    public void setThickness(Double thickness) {
        Thickness = thickness;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        Weight = weight;
    }


}
