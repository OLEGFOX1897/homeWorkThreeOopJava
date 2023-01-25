class Tornado extends PowerWind {
    private double speedRotation;

    protected void setSpeedRotation(int speedRotation) {
        this.speedRotation = speedRotation;
    }

    double getSpeedRotation() {
        return speedRotation;
    }
    void showSpeedRotation(){
        System.out.println("Скорость вращения: "+ getSpeedRotation()+"м/с");
    }
}
