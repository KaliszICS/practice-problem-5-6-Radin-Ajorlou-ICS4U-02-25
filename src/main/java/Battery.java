class Battery {
    
    private int capacityMAh;
    private boolean isCharged = false;

    public Battery(int capacityMAh){
        this.capacityMAh = capacityMAh;
    }

    public void charge(){
        this.isCharged = true;
    }

    public boolean isCharged(){
        return this.isCharged;
    }

    public int getCapacityMAh(){
        return this.capacityMAh;
    }

    public String toString(){
        return ("Batter: " + capacityMAh + "mAH, Charged: " + isCharged);
    }

    
}
