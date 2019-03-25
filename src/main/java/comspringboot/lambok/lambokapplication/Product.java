package comspringboot.lambok.lambokapplication;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
//@ToString
//@Getter
//@Setter
public class Product {
    private String ProdName;
    private int BatchNo;
    private int ManufactureNo;
    private String Type;

//    public String getProdName() {
//        return ProdName;
//    }
//
//    public void setProdName(String prodName) {
//        ProdName = prodName;
//    }
//
//    public int getBatchNo() {
//        return BatchNo;
//    }
//
//    public void setBatchNo(int batchNo) {
//        BatchNo = batchNo;
//    }
//
//    public int getManufactureNo() {
//        return ManufactureNo;
//    }
//
//    public void setManufactureNo(int manufactureNo) {
//        ManufactureNo = manufactureNo;
//    }
//
//    public String getType() {
//        return Type;
//    }
//
//    public void setType(String type) {
//        Type = type;
//    }
}
