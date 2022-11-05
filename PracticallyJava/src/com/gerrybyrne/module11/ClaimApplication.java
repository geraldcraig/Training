package com.gerrybyrne.module11;

import java.time.LocalDate;

public class ClaimApplication {

    public static void main(String[] args) {

        int numberOfClaimsEntered = 0;
        double vatamount;

        LocalDate localDate = LocalDate.now();

        String myDateString = localDate.toString();

        ClaimDetails myClaimDetailsInstance = new ClaimDetails(myDateString);

        // ClaimDetails myClaimDetailsInstance = new ClaimDetails(myDateString, "\tThank you for your claims\n\tthey will be processed today");

        int numberOfClaimsBeingMade = myClaimDetailsInstance.HowManyClaimsAreBeingMade();

        do {

            myClaimDetailsInstance.ReadTheRepairShopID();
            myClaimDetailsInstance.WriteRepairShopIdToTheArray();
            myClaimDetailsInstance.ReadTheVehiclePolicyNumber();
            myClaimDetailsInstance.WriteVehiclePolicyNumberToTheArray();
            myClaimDetailsInstance.ReadTheAmountBeingClaimed();
            myClaimDetailsInstance.WriteClaimAmountToTheArray();
            myClaimDetailsInstance.WriteRepairDateToTheArray();

            numberOfClaimsEntered++;
        } while (numberOfClaimsEntered < numberOfClaimsBeingMade);

        for (String item: myClaimDetailsInstance.repairShopClaims) {
            System.out.println(item);
        }

        vatamount = myClaimDetailsInstance.CalculateVATAmount(myClaimDetailsInstance.totalofallclaims);

        myClaimDetailsInstance.DisplayInvoiceReceipt(myClaimDetailsInstance.totalofallclaims, vatamount);

    }

}
