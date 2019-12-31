package com.example.smartkirkabbogor.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class DataKir implements Parcelable {

    @SerializedName("RecDate")
    String RecDate;
    @SerializedName("RecUser")
    String RecUser;
    @SerializedName("IdWajibUji")
    String IdWajibUji;
    @SerializedName("IdKendaraan")
    String IdKendaraan;
    @SerializedName("NoUji")
    String NoUji;
    @SerializedName("NoKendaraan")
    String NoKendaraan;
    @SerializedName("NoMesin")
    String NoMesin;
    @SerializedName("NoRangka")
    String NoRangka;
    @SerializedName("NmJenis")
    String NmJenis;
    @SerializedName("TarifJenis")
    String TarifJenis;
    @SerializedName("MerekTipe")
    String MerekTipe;
    @SerializedName("NmBahanBakar")
    String NmBahanBakar;
    @SerializedName("IdJenis")
    String IdJenis;
    @SerializedName("IdTipe")
    String IdTipe;
    @SerializedName("IdBahanBakar")
    String IdBahanBakar;
    @SerializedName("TahunProduksi")
    String TahunProduksi;
    @SerializedName("NmPemilik")
    String NmPemilik;
    @SerializedName("Alamat")
    String Alamat;
    @SerializedName("KodePos")
    String KodePos;
    @SerializedName("NmKotaKab")
    String NmKotaKab;
    @SerializedName("InisialPerdana")
    String InisialPerdana;
    @SerializedName("NmMerek")
    String NmMerek;
    @SerializedName("NmTipe")
    String NmTipe;
    @SerializedName("NmStatus")
    String NmStatus;
    @SerializedName("NoSRUT")
    String NoSRUT;
    @SerializedName("IdStatus")
    String IdStatus;
    @SerializedName("NmPropinsi")
    String NmPropinsi;
    @SerializedName("IsiSilinder")
    String IsiSilinder;
    @SerializedName("DayaMotor")
    String DayaMotor;
    @SerializedName("TglSRUT")
    String TglSRUT;
    @SerializedName("BlnSRUT")
    String BlnSRUT;
    @SerializedName("ThnSRUT")
    String ThnSRUT;
    @SerializedName("Aktif")
    String Aktif;
    @SerializedName("NoUjiBaru")
    String NoUjiBaru;
    @SerializedName("InstitusiAsal")
    String InstitusiAsal;
    @SerializedName("SuratMutasiMasuk")
    String SuratMutasiMasuk;
    @SerializedName("SuratNumpangMasuk")
    String SuratNumpangMasuk;
    @SerializedName("TglTerbit")
    String TglTerbit;
    @SerializedName("NmKategoriJenis")
    String NmKategoriJenis;
    @SerializedName("Tarif")
    String Tarif;
    @SerializedName("KelompokBahanBakar")
    String KelompokBahanBakar;
    @SerializedName("KdJenis")
    String KdJenis;
    @SerializedName("JumlahSumbu")
    String JumlahSumbu;
    @SerializedName("JBB")
    String JBB;
    @SerializedName("IdAnggotaSubJenis")
    String IdAnggotaSubJenis;
    @SerializedName("TarifDenda")
    String TarifDenda;
    @SerializedName("NmSubJenis")
    String NmSubJenis;
    @SerializedName("IdSubJenis")
    String IdSubJenis;
    @SerializedName("KartuID")
    String KartuID;
    @SerializedName("TglSRUT_Full")
    String TglSRUT_Full;
    @SerializedName("NoRegSRUT")
    String NoRegSRUT;
    @SerializedName("JBKB")
    String JBKB;
    @SerializedName("JBI")
    String JBI;
    @SerializedName("JBKI")
    String JBKI;
    @SerializedName("MST")
    String MST;
    @SerializedName("BeratKosong")
    String BeratKosong;
    @SerializedName("KonfigSb")
    String KonfigSb;
    @SerializedName("BanSb1")
    String BanSb1;
    @SerializedName("DimPanjang")
    String DimPanjang;
    @SerializedName("DimLebar")
    String DimLebar;
    @SerializedName("DimTinggi")
    String DimTinggi;
    @SerializedName("BoxPanjang")
    String BoxPanjang;
    @SerializedName("BoxLebar")
    String BoxLebar;
    @SerializedName("BoxTinggi")
    String BoxTinggi;
    @SerializedName("DimROH")
    String DimROH;
    @SerializedName("DimFOH")
    String DimFOH;
    @SerializedName("DimWBSb12")
    String DimWBSb12;
    @SerializedName("DimWBSb23")
    String DimWBSb23;
    @SerializedName("DimWBSb34")
    String DimWBSb34;
    @SerializedName("DayaAngkutOrg")
    String DayaAngkutOrg;
    @SerializedName("DayaAngkutBrg")
    String DayaAngkutBrg;
    @SerializedName("NmKelasJalan")
    String NmKelasJalan;
    @SerializedName("IdKategoriJenis")
    String IdKategoriJenis;
    @SerializedName("BeratKosongSb1")
    String BeratKosongSb1;
    @SerializedName("BeratKosongSb2")
    String BeratKosongSb2;
    @SerializedName("BeratKosongSb3")
    String BeratKosongSb3;
    @SerializedName("BeratKosongSb4")
    String BeratKosongSb4;


    protected DataKir(Parcel in) {
        RecDate = in.readString();
        RecUser = in.readString();
        IdWajibUji = in.readString();
        IdKendaraan = in.readString();
        NoUji = in.readString();
        NoKendaraan = in.readString();
        NoMesin = in.readString();
        NoRangka = in.readString();
        NmJenis = in.readString();
        TarifJenis = in.readString();
        MerekTipe = in.readString();
        NmBahanBakar = in.readString();
        IdJenis = in.readString();
        IdTipe = in.readString();
        IdBahanBakar = in.readString();
        TahunProduksi = in.readString();
        NmPemilik = in.readString();
        Alamat = in.readString();
        KodePos = in.readString();
        NmKotaKab = in.readString();
        InisialPerdana = in.readString();
        NmMerek = in.readString();
        NmTipe = in.readString();
        NmStatus = in.readString();
        NoSRUT = in.readString();
        IdStatus = in.readString();
        NmPropinsi = in.readString();
        IsiSilinder = in.readString();
        DayaMotor = in.readString();
        TglSRUT = in.readString();
        BlnSRUT = in.readString();
        ThnSRUT = in.readString();
        Aktif = in.readString();
        NoUjiBaru = in.readString();
        InstitusiAsal = in.readString();
        SuratMutasiMasuk = in.readString();
        SuratNumpangMasuk = in.readString();
        TglTerbit = in.readString();
        NmKategoriJenis = in.readString();
        Tarif = in.readString();
        KelompokBahanBakar = in.readString();
        KdJenis = in.readString();
        JumlahSumbu = in.readString();
        JBB = in.readString();
        IdAnggotaSubJenis = in.readString();
        TarifDenda = in.readString();
        NmSubJenis = in.readString();
        IdSubJenis = in.readString();
        KartuID = in.readString();
        TglSRUT_Full = in.readString();
        NoRegSRUT = in.readString();
        JBKB = in.readString();
        JBI = in.readString();
        JBKI = in.readString();
        MST = in.readString();
        BeratKosong = in.readString();
        KonfigSb = in.readString();
        BanSb1 = in.readString();
        DimPanjang = in.readString();
        DimLebar = in.readString();
        DimTinggi = in.readString();
        BoxPanjang = in.readString();
        BoxLebar = in.readString();
        BoxTinggi = in.readString();
        DimROH = in.readString();
        DimFOH = in.readString();
        DimWBSb12 = in.readString();
        DimWBSb23 = in.readString();
        DimWBSb34 = in.readString();
        DayaAngkutOrg = in.readString();
        DayaAngkutBrg = in.readString();
        NmKelasJalan = in.readString();
        IdKategoriJenis = in.readString();
        BeratKosongSb1 = in.readString();
        BeratKosongSb2 = in.readString();
        BeratKosongSb3 = in.readString();
        BeratKosongSb4 = in.readString();
    }

    public static final Creator<DataKir> CREATOR = new Creator<DataKir>() {
        @Override
        public DataKir createFromParcel(Parcel in) {
            return new DataKir(in);
        }

        @Override
        public DataKir[] newArray(int size) {
            return new DataKir[size];
        }
    };

    public String getRecDate() {
        return RecDate;
    }

    public void setRecDate(String recDate) {
        RecDate = recDate;
    }

    public String getRecUser() {
        return RecUser;
    }

    public void setRecUser(String recUser) {
        RecUser = recUser;
    }

    public String getIdWajibUji() {
        return IdWajibUji;
    }

    public void setIdWajibUji(String idWajibUji) {
        IdWajibUji = idWajibUji;
    }

    public String getIdKendaraan() {
        return IdKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        IdKendaraan = idKendaraan;
    }

    public String getNoUji() {
        return NoUji;
    }

    public void setNoUji(String noUji) {
        NoUji = noUji;
    }

    public String getNoKendaraan() {
        return NoKendaraan;
    }

    public void setNoKendaraan(String noKendaraan) {
        NoKendaraan = noKendaraan;
    }

    public String getNoMesin() {
        return NoMesin;
    }

    public void setNoMesin(String noMesin) {
        NoMesin = noMesin;
    }

    public String getNoRangka() {
        return NoRangka;
    }

    public void setNoRangka(String noRangka) {
        NoRangka = noRangka;
    }

    public String getNmJenis() {
        return NmJenis;
    }

    public void setNmJenis(String nmJenis) {
        NmJenis = nmJenis;
    }

    public String getTarifJenis() {
        return TarifJenis;
    }

    public void setTarifJenis(String tarifJenis) {
        TarifJenis = tarifJenis;
    }

    public String getMerekTipe() {
        return MerekTipe;
    }

    public void setMerekTipe(String merekTipe) {
        MerekTipe = merekTipe;
    }

    public String getNmBahanBakar() {
        return NmBahanBakar;
    }

    public void setNmBahanBakar(String nmBahanBakar) {
        NmBahanBakar = nmBahanBakar;
    }

    public String getIdJenis() {
        return IdJenis;
    }

    public void setIdJenis(String idJenis) {
        IdJenis = idJenis;
    }

    public String getIdTipe() {
        return IdTipe;
    }

    public void setIdTipe(String idTipe) {
        IdTipe = idTipe;
    }

    public String getIdBahanBakar() {
        return IdBahanBakar;
    }

    public void setIdBahanBakar(String idBahanBakar) {
        IdBahanBakar = idBahanBakar;
    }

    public String getTahunProduksi() {
        return TahunProduksi;
    }

    public void setTahunProduksi(String tahunProduksi) {
        TahunProduksi = tahunProduksi;
    }

    public String getNmPemilik() {
        return NmPemilik;
    }

    public void setNmPemilik(String nmPemilik) {
        NmPemilik = nmPemilik;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getKodePos() {
        return KodePos;
    }

    public void setKodePos(String kodePos) {
        KodePos = kodePos;
    }

    public String getNmKotaKab() {
        return NmKotaKab;
    }

    public void setNmKotaKab(String nmKotaKab) {
        NmKotaKab = nmKotaKab;
    }

    public String getInisialPerdana() {
        return InisialPerdana;
    }

    public void setInisialPerdana(String inisialPerdana) {
        InisialPerdana = inisialPerdana;
    }

    public String getNmMerek() {
        return NmMerek;
    }

    public void setNmMerek(String nmMerek) {
        NmMerek = nmMerek;
    }

    public String getNmTipe() {
        return NmTipe;
    }

    public void setNmTipe(String nmTipe) {
        NmTipe = nmTipe;
    }

    public String getNmStatus() {
        return NmStatus;
    }

    public void setNmStatus(String nmStatus) {
        NmStatus = nmStatus;
    }

    public String getNoSRUT() {
        return NoSRUT;
    }

    public void setNoSRUT(String noSRUT) {
        NoSRUT = noSRUT;
    }

    public String getIdStatus() {
        return IdStatus;
    }

    public void setIdStatus(String idStatus) {
        IdStatus = idStatus;
    }

    public String getNmPropinsi() {
        return NmPropinsi;
    }

    public void setNmPropinsi(String nmPropinsi) {
        NmPropinsi = nmPropinsi;
    }

    public String getIsiSilinder() {
        return IsiSilinder;
    }

    public void setIsiSilinder(String isiSilinder) {
        IsiSilinder = isiSilinder;
    }

    public String getDayaMotor() {
        return DayaMotor;
    }

    public void setDayaMotor(String dayaMotor) {
        DayaMotor = dayaMotor;
    }

    public String getTglSRUT() {
        return TglSRUT;
    }

    public void setTglSRUT(String tglSRUT) {
        TglSRUT = tglSRUT;
    }

    public String getBlnSRUT() {
        return BlnSRUT;
    }

    public void setBlnSRUT(String blnSRUT) {
        BlnSRUT = blnSRUT;
    }

    public String getThnSRUT() {
        return ThnSRUT;
    }

    public void setThnSRUT(String thnSRUT) {
        ThnSRUT = thnSRUT;
    }

    public String getAktif() {
        return Aktif;
    }

    public void setAktif(String aktif) {
        Aktif = aktif;
    }

    public String getNoUjiBaru() {
        return NoUjiBaru;
    }

    public void setNoUjiBaru(String noUjiBaru) {
        NoUjiBaru = noUjiBaru;
    }

    public String getInstitusiAsal() {
        return InstitusiAsal;
    }

    public void setInstitusiAsal(String institusiAsal) {
        InstitusiAsal = institusiAsal;
    }

    public String getSuratMutasiMasuk() {
        return SuratMutasiMasuk;
    }

    public void setSuratMutasiMasuk(String suratMutasiMasuk) {
        SuratMutasiMasuk = suratMutasiMasuk;
    }

    public String getSuratNumpangMasuk() {
        return SuratNumpangMasuk;
    }

    public void setSuratNumpangMasuk(String suratNumpangMasuk) {
        SuratNumpangMasuk = suratNumpangMasuk;
    }

    public String getTglTerbit() {
        return TglTerbit;
    }

    public void setTglTerbit(String tglTerbit) {
        TglTerbit = tglTerbit;
    }

    public String getNmKategoriJenis() {
        return NmKategoriJenis;
    }

    public void setNmKategoriJenis(String nmKategoriJenis) {
        NmKategoriJenis = nmKategoriJenis;
    }

    public String getTarif() {
        return Tarif;
    }

    public void setTarif(String tarif) {
        Tarif = tarif;
    }

    public String getKelompokBahanBakar() {
        return KelompokBahanBakar;
    }

    public void setKelompokBahanBakar(String kelompokBahanBakar) {
        KelompokBahanBakar = kelompokBahanBakar;
    }

    public String getKdJenis() {
        return KdJenis;
    }

    public void setKdJenis(String kdJenis) {
        KdJenis = kdJenis;
    }

    public String getJumlahSumbu() {
        return JumlahSumbu;
    }

    public void setJumlahSumbu(String jumlahSumbu) {
        JumlahSumbu = jumlahSumbu;
    }

    public String getJBB() {
        return JBB;
    }

    public void setJBB(String JBB) {
        this.JBB = JBB;
    }

    public String getIdAnggotaSubJenis() {
        return IdAnggotaSubJenis;
    }

    public void setIdAnggotaSubJenis(String idAnggotaSubJenis) {
        IdAnggotaSubJenis = idAnggotaSubJenis;
    }

    public String getTarifDenda() {
        return TarifDenda;
    }

    public void setTarifDenda(String tarifDenda) {
        TarifDenda = tarifDenda;
    }

    public String getNmSubJenis() {
        return NmSubJenis;
    }

    public void setNmSubJenis(String nmSubJenis) {
        NmSubJenis = nmSubJenis;
    }

    public String getIdSubJenis() {
        return IdSubJenis;
    }

    public void setIdSubJenis(String idSubJenis) {
        IdSubJenis = idSubJenis;
    }

    public String getKartuID() {
        return KartuID;
    }

    public void setKartuID(String kartuID) {
        KartuID = kartuID;
    }

    public String getTglSRUT_Full() {
        return TglSRUT_Full;
    }

    public void setTglSRUT_Full(String tglSRUT_Full) {
        TglSRUT_Full = tglSRUT_Full;
    }

    public String getNoRegSRUT() {
        return NoRegSRUT;
    }

    public void setNoRegSRUT(String noRegSRUT) {
        NoRegSRUT = noRegSRUT;
    }

    public String getJBKB() {
        return JBKB;
    }

    public void setJBKB(String JBKB) {
        this.JBKB = JBKB;
    }

    public String getJBI() {
        return JBI;
    }

    public void setJBI(String JBI) {
        this.JBI = JBI;
    }

    public String getJBKI() {
        return JBKI;
    }

    public void setJBKI(String JBKI) {
        this.JBKI = JBKI;
    }

    public String getMST() {
        return MST;
    }

    public void setMST(String MST) {
        this.MST = MST;
    }

    public String getBeratKosong() {
        return BeratKosong;
    }

    public void setBeratKosong(String beratKosong) {
        BeratKosong = beratKosong;
    }

    public String getKonfigSb() {
        return KonfigSb;
    }

    public void setKonfigSb(String konfigSb) {
        KonfigSb = konfigSb;
    }

    public String getBanSb1() {
        return BanSb1;
    }

    public void setBanSb1(String banSb1) {
        BanSb1 = banSb1;
    }

    public String getDimPanjang() {
        return DimPanjang;
    }

    public void setDimPanjang(String dimPanjang) {
        DimPanjang = dimPanjang;
    }

    public String getDimLebar() {
        return DimLebar;
    }

    public void setDimLebar(String dimLebar) {
        DimLebar = dimLebar;
    }

    public String getDimTinggi() {
        return DimTinggi;
    }

    public void setDimTinggi(String dimTinggi) {
        DimTinggi = dimTinggi;
    }

    public String getBoxPanjang() {
        return BoxPanjang;
    }

    public void setBoxPanjang(String boxPanjang) {
        BoxPanjang = boxPanjang;
    }

    public String getBoxLebar() {
        return BoxLebar;
    }

    public void setBoxLebar(String boxLebar) {
        BoxLebar = boxLebar;
    }

    public String getBoxTinggi() {
        return BoxTinggi;
    }

    public void setBoxTinggi(String boxTinggi) {
        BoxTinggi = boxTinggi;
    }

    public String getDimROH() {
        return DimROH;
    }

    public void setDimROH(String dimROH) {
        DimROH = dimROH;
    }

    public String getDimFOH() {
        return DimFOH;
    }

    public void setDimFOH(String dimFOH) {
        DimFOH = dimFOH;
    }

    public String getDimWBSb12() {
        return DimWBSb12;
    }

    public void setDimWBSb12(String dimWBSb12) {
        DimWBSb12 = dimWBSb12;
    }

    public String getDimWBSb23() {
        return DimWBSb23;
    }

    public void setDimWBSb23(String dimWBSb23) {
        DimWBSb23 = dimWBSb23;
    }

    public String getDimWBSb34() {
        return DimWBSb34;
    }

    public void setDimWBSb34(String dimWBSb34) {
        DimWBSb34 = dimWBSb34;
    }

    public String getDayaAngkutOrg() {
        return DayaAngkutOrg;
    }

    public void setDayaAngkutOrg(String dayaAngkutOrg) {
        DayaAngkutOrg = dayaAngkutOrg;
    }

    public String getDayaAngkutBrg() {
        return DayaAngkutBrg;
    }

    public void setDayaAngkutBrg(String dayaAngkutBrg) {
        DayaAngkutBrg = dayaAngkutBrg;
    }

    public String getNmKelasJalan() {
        return NmKelasJalan;
    }

    public void setNmKelasJalan(String nmKelasJalan) {
        NmKelasJalan = nmKelasJalan;
    }

    public String getIdKategoriJenis() {
        return IdKategoriJenis;
    }

    public void setIdKategoriJenis(String idKategoriJenis) {
        IdKategoriJenis = idKategoriJenis;
    }

    public String getBeratKosongSb1() {
        return BeratKosongSb1;
    }

    public void setBeratKosongSb1(String beratKosongSb1) {
        BeratKosongSb1 = beratKosongSb1;
    }

    public String getBeratKosongSb2() {
        return BeratKosongSb2;
    }

    public void setBeratKosongSb2(String beratKosongSb2) {
        BeratKosongSb2 = beratKosongSb2;
    }

    public String getBeratKosongSb3() {
        return BeratKosongSb3;
    }

    public void setBeratKosongSb3(String beratKosongSb3) {
        BeratKosongSb3 = beratKosongSb3;
    }

    public String getBeratKosongSb4() {
        return BeratKosongSb4;
    }

    public void setBeratKosongSb4(String beratKosongSb4) {
        BeratKosongSb4 = beratKosongSb4;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(RecDate);
        parcel.writeString(RecUser);
        parcel.writeString(IdWajibUji);
        parcel.writeString(IdKendaraan);
        parcel.writeString(NoUji);
        parcel.writeString(NoKendaraan);
        parcel.writeString(NoMesin);
        parcel.writeString(NoRangka);
        parcel.writeString(NmJenis);
        parcel.writeString(TarifJenis);
        parcel.writeString(MerekTipe);
        parcel.writeString(NmBahanBakar);
        parcel.writeString(IdJenis);
        parcel.writeString(IdTipe);
        parcel.writeString(IdBahanBakar);
        parcel.writeString(TahunProduksi);
        parcel.writeString(NmPemilik);
        parcel.writeString(Alamat);
        parcel.writeString(KodePos);
        parcel.writeString(NmKotaKab);
        parcel.writeString(InisialPerdana);
        parcel.writeString(NmMerek);
        parcel.writeString(NmTipe);
        parcel.writeString(NmStatus);
        parcel.writeString(NoSRUT);
        parcel.writeString(IdStatus);
        parcel.writeString(NmPropinsi);
        parcel.writeString(IsiSilinder);
        parcel.writeString(DayaMotor);
        parcel.writeString(TglSRUT);
        parcel.writeString(BlnSRUT);
        parcel.writeString(ThnSRUT);
        parcel.writeString(Aktif);
        parcel.writeString(NoUjiBaru);
        parcel.writeString(InstitusiAsal);
        parcel.writeString(SuratMutasiMasuk);
        parcel.writeString(SuratNumpangMasuk);
        parcel.writeString(TglTerbit);
        parcel.writeString(NmKategoriJenis);
        parcel.writeString(Tarif);
        parcel.writeString(KelompokBahanBakar);
        parcel.writeString(KdJenis);
        parcel.writeString(JumlahSumbu);
        parcel.writeString(JBB);
        parcel.writeString(IdAnggotaSubJenis);
        parcel.writeString(TarifDenda);
        parcel.writeString(NmSubJenis);
        parcel.writeString(IdSubJenis);
        parcel.writeString(KartuID);
        parcel.writeString(TglSRUT_Full);
        parcel.writeString(NoRegSRUT);
        parcel.writeString(JBKB);
        parcel.writeString(JBI);
        parcel.writeString(JBKI);
        parcel.writeString(MST);
        parcel.writeString(BeratKosong);
        parcel.writeString(KonfigSb);
        parcel.writeString(BanSb1);
        parcel.writeString(DimPanjang);
        parcel.writeString(DimLebar);
        parcel.writeString(DimTinggi);
        parcel.writeString(BoxPanjang);
        parcel.writeString(BoxLebar);
        parcel.writeString(BoxTinggi);
        parcel.writeString(DimROH);
        parcel.writeString(DimFOH);
        parcel.writeString(DimWBSb12);
        parcel.writeString(DimWBSb23);
        parcel.writeString(DimWBSb34);
        parcel.writeString(DayaAngkutOrg);
        parcel.writeString(DayaAngkutBrg);
        parcel.writeString(NmKelasJalan);
        parcel.writeString(IdKategoriJenis);
        parcel.writeString(BeratKosongSb1);
        parcel.writeString(BeratKosongSb2);
        parcel.writeString(BeratKosongSb3);
        parcel.writeString(BeratKosongSb4);
    }
}
