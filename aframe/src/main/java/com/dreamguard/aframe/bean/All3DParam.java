package com.dreamguard.aframe.bean;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 *     author : daihailin
 *     e-mail : daihl@kdxfilm.com
 *     time   : 2018/05/21
 *     desc   :
 *     version: 1.0
 * </pre>
 */

public class All3DParam implements Serializable {


    private static final long serialVersionUID = -6112139268946348200L;
    /**
     * errorCode : 0
     * buType : 0
     * seq : 0
     * data : {"devfilminfo":[{"filmId":"","eid":"","model":"3434","man":"wztech","slant":"","pitch":"","cameraX":"","cameraY":"","eyeSlant":"","period":"","offset":"","pitchA":"","pitchB":"","ec":"","arcMode":"","disX":"","vod":"","rgbMode":"","filmType":"1","inner":0,"fov":"2","near":"","far":""}],"plugfilminfo":[{"filmId":"111","eid":"222","model":"m1721","man":"alps","slant":"-4.797361","pitch":"19.6869","createId":"47c04798bbe34e5baebc7b2dc180b55a","cameraX":"-158.7","cameraY":"746.0","eyeSlant":"-4.797361","period":"206.30975","offset":"0","pitchA":"19.63996","pitchB":"5.87E-04","status":"U","ec":"65","arcMode":"TYPE1","disX":"65","vod":"0","rgbMode":"2","filmType":"101","inner":0,"fov":"60","near":"30","far":"50","proname":"魅蓝M6外挂","serno":"KDXv25.0-M6Note"}]}
     */

    private int errorCode;
    private int buType;
    private int seq;
    private DataBean data;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public int getBuType() {
        return buType;
    }

    public void setBuType(int buType) {
        this.buType = buType;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<DevfilminfoBean> devfilminfo;
        private List<PlugfilminfoBean> plugfilminfo;

        public List<DevfilminfoBean> getDevfilminfo() {
            return devfilminfo;
        }

        public void setDevfilminfo(List<DevfilminfoBean> devfilminfo) {
            this.devfilminfo = devfilminfo;
        }

        public List<PlugfilminfoBean> getPlugfilminfo() {
            return plugfilminfo;
        }

        public void setPlugfilminfo(List<PlugfilminfoBean> plugfilminfo) {
            this.plugfilminfo = plugfilminfo;
        }

        public static class DevfilminfoBean {
            /**
             * filmId :
             * eid :
             * model : 3434
             * man : wztech
             * slant :
             * pitch :
             * cameraX :
             * cameraY :
             * eyeSlant :
             * period :
             * offset :
             * pitchA :
             * pitchB :
             * ec :
             * arcMode :
             * disX :
             * vod :
             * rgbMode :
             * filmType : 1
             * inner : 0
             * fov : 2
             * near :
             * far :
             */

            private String filmId;
            private String eid;
            private String model;
            private String man;
            private String slant;
            private String pitch;
            private String cameraX;
            private String cameraY;
            private String eyeSlant;
            private String period;
            private String offset;
            private String pitchA;
            private String pitchB;
            private String ec;
            private String arcMode;
            private String disX;
            private String vod;
            private String rgbMode;
            private String filmType;
            private int inner;
            private String fov;
            private String near;
            private String far;

            public String getFilmId() {
                return filmId;
            }

            public void setFilmId(String filmId) {
                this.filmId = filmId;
            }

            public String getEid() {
                return eid;
            }

            public void setEid(String eid) {
                this.eid = eid;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getMan() {
                return man;
            }

            public void setMan(String man) {
                this.man = man;
            }

            public String getSlant() {
                return slant;
            }

            public void setSlant(String slant) {
                this.slant = slant;
            }

            public String getPitch() {
                return pitch;
            }

            public void setPitch(String pitch) {
                this.pitch = pitch;
            }

            public String getCameraX() {
                return cameraX;
            }

            public void setCameraX(String cameraX) {
                this.cameraX = cameraX;
            }

            public String getCameraY() {
                return cameraY;
            }

            public void setCameraY(String cameraY) {
                this.cameraY = cameraY;
            }

            public String getEyeSlant() {
                return eyeSlant;
            }

            public void setEyeSlant(String eyeSlant) {
                this.eyeSlant = eyeSlant;
            }

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public String getOffset() {
                return offset;
            }

            public void setOffset(String offset) {
                this.offset = offset;
            }

            public String getPitchA() {
                return pitchA;
            }

            public void setPitchA(String pitchA) {
                this.pitchA = pitchA;
            }

            public String getPitchB() {
                return pitchB;
            }

            public void setPitchB(String pitchB) {
                this.pitchB = pitchB;
            }

            public String getEc() {
                return ec;
            }

            public void setEc(String ec) {
                this.ec = ec;
            }

            public String getArcMode() {
                return arcMode;
            }

            public void setArcMode(String arcMode) {
                this.arcMode = arcMode;
            }

            public String getDisX() {
                return disX;
            }

            public void setDisX(String disX) {
                this.disX = disX;
            }

            public String getVod() {
                return vod;
            }

            public void setVod(String vod) {
                this.vod = vod;
            }

            public String getRgbMode() {
                return rgbMode;
            }

            public void setRgbMode(String rgbMode) {
                this.rgbMode = rgbMode;
            }

            public String getFilmType() {
                return filmType;
            }

            public void setFilmType(String filmType) {
                this.filmType = filmType;
            }

            public int getInner() {
                return inner;
            }

            public void setInner(int inner) {
                this.inner = inner;
            }

            public String getFov() {
                return fov;
            }

            public void setFov(String fov) {
                this.fov = fov;
            }

            public String getNear() {
                return near;
            }

            public void setNear(String near) {
                this.near = near;
            }

            public String getFar() {
                return far;
            }

            public void setFar(String far) {
                this.far = far;
            }
        }

        public static class PlugfilminfoBean {
            /**
             * filmId : 111
             * eid : 222
             * model : m1721
             * man : alps
             * slant : -4.797361
             * pitch : 19.6869
             * createId : 47c04798bbe34e5baebc7b2dc180b55a
             * cameraX : -158.7
             * cameraY : 746.0
             * eyeSlant : -4.797361
             * period : 206.30975
             * offset : 0
             * pitchA : 19.63996
             * pitchB : 5.87E-04
             * status : U
             * ec : 65
             * arcMode : TYPE1
             * disX : 65
             * vod : 0
             * rgbMode : 2
             * filmType : 101
             * inner : 0
             * fov : 60
             * near : 30
             * far : 50
             * proname : 魅蓝M6外挂
             * serno : KDXv25.0-M6Note
             */

            private String filmId;
            private String eid;
            private String model;
            private String man;
            private String slant;
            private String pitch;
            private String createId;
            private String cameraX;
            private String cameraY;
            private String eyeSlant;
            private String period;
            private String offset;
            private String pitchA;
            private String pitchB;
            private String status;
            private String ec;
            private String arcMode;
            private String disX;
            private String vod;
            private String rgbMode;
            private String filmType;
            private int inner;
            private String fov;
            private String nearh;
            private String farh;
            private String nearv;
            private String farv;
            private String screenOrientation;
            private String proname;
            private String serno;

            public String getFilmId() {
                return filmId;
            }

            public void setFilmId(String filmId) {
                this.filmId = filmId;
            }

            public String getEid() {
                return eid;
            }

            public void setEid(String eid) {
                this.eid = eid;
            }

            public String getModel() {
                return model;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public String getMan() {
                return man;
            }

            public void setMan(String man) {
                this.man = man;
            }

            public String getSlant() {
                return slant;
            }

            public void setSlant(String slant) {
                this.slant = slant;
            }

            public String getPitch() {
                return pitch;
            }

            public void setPitch(String pitch) {
                this.pitch = pitch;
            }

            public String getCreateId() {
                return createId;
            }

            public void setCreateId(String createId) {
                this.createId = createId;
            }

            public String getCameraX() {
                return cameraX;
            }

            public void setCameraX(String cameraX) {
                this.cameraX = cameraX;
            }

            public String getCameraY() {
                return cameraY;
            }

            public void setCameraY(String cameraY) {
                this.cameraY = cameraY;
            }

            public String getEyeSlant() {
                return eyeSlant;
            }

            public void setEyeSlant(String eyeSlant) {
                this.eyeSlant = eyeSlant;
            }

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

            public String getOffset() {
                return offset;
            }

            public void setOffset(String offset) {
                this.offset = offset;
            }

            public String getPitchA() {
                return pitchA;
            }

            public void setPitchA(String pitchA) {
                this.pitchA = pitchA;
            }

            public String getPitchB() {
                return pitchB;
            }

            public void setPitchB(String pitchB) {
                this.pitchB = pitchB;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getEc() {
                return ec;
            }

            public void setEc(String ec) {
                this.ec = ec;
            }

            public String getArcMode() {
                return arcMode;
            }

            public void setArcMode(String arcMode) {
                this.arcMode = arcMode;
            }

            public String getDisX() {
                return disX;
            }

            public void setDisX(String disX) {
                this.disX = disX;
            }

            public String getVod() {
                return vod;
            }

            public void setVod(String vod) {
                this.vod = vod;
            }

            public String getRgbMode() {
                return rgbMode;
            }

            public void setRgbMode(String rgbMode) {
                this.rgbMode = rgbMode;
            }

            public String getFilmType() {
                return filmType;
            }

            public void setFilmType(String filmType) {
                this.filmType = filmType;
            }

            public int getInner() {
                return inner;
            }

            public void setInner(int inner) {
                this.inner = inner;
            }

            public String getFov() {
                return fov;
            }

            public void setFov(String fov) {
                this.fov = fov;
            }

            public String getNearh() {
                return nearh;
            }

            public void setNearh(String nearh) {
                this.nearh = nearh;
            }

            public String getFarh() {
                return farh;
            }

            public void setFarh(String farh) {
                this.farh = farh;
            }

            public String getNearv() {
                return nearv;
            }

            public void setNearv(String nearv) {
                this.nearv = nearv;
            }

            public String getFarv() {
                return farv;
            }

            public void setFarv(String farv) {
                this.farv = farv;
            }

            public String getScreenOrientation() {
                return screenOrientation;
            }

            public void setScreenOrientation(String screenOrientation) {
                this.screenOrientation = screenOrientation;
            }

            public String getProname() {
                return proname;
            }

            public void setProname(String proname) {
                this.proname = proname;
            }

            public String getSerno() {
                return serno;
            }

            public void setSerno(String serno) {
                this.serno = serno;
            }
        }
    }

    @Override
    public String toString() {
        return "All3DParam{" +
                "errorCode=" + errorCode +
                ", buType=" + buType +
                ", seq=" + seq +
                ", data=" + data +
                '}';
    }
}
