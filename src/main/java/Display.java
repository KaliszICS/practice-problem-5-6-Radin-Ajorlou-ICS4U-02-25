class Display {
    
    private double sizeInches;
    private String resolution;
    private boolean onOff = false;

    public Display(double sizeInches, String resolution){
        this.sizeInches = sizeInches;
        this.resolution = resolution;
    };

    public String turnOn(){
        this.onOff = true;
        return "Display turned on. " + this.sizeInches + "inch, " + this.resolution;
    }

    public String turnOff(){
        this.onOff = false;
        return "Display turned off.";
    }

    public boolean isOn(){
        return this.onOff;
    }

    public double getSizeInches(){
        return this.sizeInches;
    }

    public String getResolution(){
        return this.resolution;
    }

    public String toString(){
        return "Display: " + sizeInches + " inches, " + resolution; 
    }




}
