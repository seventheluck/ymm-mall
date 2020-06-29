
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PaymentDetails {

    @SerializedName("avs_result_code")
    private String avsResultCode;
    @SerializedName("credit_card_bin")
    private String creditCardBin;
    @SerializedName("credit_card_company")
    private String creditCardCompany;
    @SerializedName("credit_card_number")
    private String creditCardNumber;
    @SerializedName("cvv_result_code")
    private String cvvResultCode;

    public String getAvsResultCode() {
        return avsResultCode;
    }

    public String getCreditCardBin() {
        return creditCardBin;
    }

    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public String getCvvResultCode() {
        return cvvResultCode;
    }

    public static class Builder {

        private String avsResultCode;
        private String creditCardBin;
        private String creditCardCompany;
        private String creditCardNumber;
        private String cvvResultCode;

        public PaymentDetails.Builder withAvsResultCode(String avsResultCode) {
            this.avsResultCode = avsResultCode;
            return this;
        }

        public PaymentDetails.Builder withCreditCardBin(String creditCardBin) {
            this.creditCardBin = creditCardBin;
            return this;
        }

        public PaymentDetails.Builder withCreditCardCompany(String creditCardCompany) {
            this.creditCardCompany = creditCardCompany;
            return this;
        }

        public PaymentDetails.Builder withCreditCardNumber(String creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
            return this;
        }

        public PaymentDetails.Builder withCvvResultCode(String cvvResultCode) {
            this.cvvResultCode = cvvResultCode;
            return this;
        }

        public PaymentDetails build() {
            PaymentDetails paymentDetails = new PaymentDetails();
            paymentDetails.avsResultCode = avsResultCode;
            paymentDetails.creditCardBin = creditCardBin;
            paymentDetails.creditCardCompany = creditCardCompany;
            paymentDetails.creditCardNumber = creditCardNumber;
            paymentDetails.cvvResultCode = cvvResultCode;
            return paymentDetails;
        }

    }

}
