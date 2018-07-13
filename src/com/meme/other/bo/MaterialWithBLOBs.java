package com.meme.other.bo;

public class MaterialWithBLOBs extends Material {
    private byte[] materialFormate;

    private byte[] isdel;

    public byte[] getMaterialFormate() {
        return materialFormate;
    }

    public void setMaterialFormate(byte[] materialFormate) {
        this.materialFormate = materialFormate;
    }

    public byte[] getIsdel() {
        return isdel;
    }

    public void setIsdel(byte[] isdel) {
        this.isdel = isdel;
    }
}