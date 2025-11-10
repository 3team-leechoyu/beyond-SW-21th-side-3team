package store.model.dto;

public class Ai {
    private int hunger; // 배고픔
    private int thirst; // 목마름
    private int nicothineCraving; // 흡연 욕구
    private int etc; //기타

    public Ai(int etc, int hunger, int nicothineCraving, int thirst) {
        this.etc = etc;
        this.hunger = hunger;
        this.nicothineCraving = nicothineCraving;
        this.thirst = thirst;
    }

    public int getEtc() {
        return etc;
    }

    public void setEtc(int etc) {
        this.etc = etc;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getNicothineCraving() {
        return nicothineCraving;
    }

    public void setNicothineCraving(int nicothineCraving) {
        this.nicothineCraving = nicothineCraving;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}
