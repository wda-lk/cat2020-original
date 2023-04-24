package modle.asses;

/**
 * Created by Ranga on 4/25/2022.
 */
public class UpdateCustomer {

    public static void updateCustomerHistry(String idAssessment, String idCus,int idUser, String systemDate){
        try {
            int i = conn.DB.setData("UPDATE  `customer_histry` SET  `cus_status` = '0' WHERE `idAssessment` = " + idAssessment);

            conn.DB.setData("INSERT INTO `customer_histry`( `idCustomer`, `idAssessment`, `cus_reg_date`, `cus_update_date`, `user_id`, `cus_status`) VALUES ( "+idCus+", "+idAssessment+", NULL, '"+systemDate+"', "+idUser+", 1)");

        }catch (Exception exp){
            exp.printStackTrace();
        }
    }


}
