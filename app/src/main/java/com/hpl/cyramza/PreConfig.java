package com.hpl.cyramza;

import android.content.Context;
import android.content.SharedPreferences;


public class PreConfig {
    private SharedPreferences sharedPreferences;
    private Context context;

    public PreConfig(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.pref_file),Context.MODE_PRIVATE);
    }




    public void  writeDailyWork(String dailyWork)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("dailyWork",dailyWork);
        editor.apply();
    }

    public String readDailyWork()
    {
        return sharedPreferences.getString("dailyWork","");
    }

    public void  writeOrderedPartnerId(String orderedPartnerId)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("orderedPartnerId",orderedPartnerId);
        editor.apply();
    }

    public String readOrderedPartnerId()
    {
        return sharedPreferences.getString("orderedPartnerId","");
    }

    public void  writeOrderedPartner(String orderedPartner)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("orderedPartner",orderedPartner);
        editor.apply();
    }

    public String readOrderedPartner()
    {
        return sharedPreferences.getString("orderedPartner","");
    }

    public void  writePackagePrice(String packagePrice)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("packagePrice",packagePrice);
        editor.apply();
    }

    public String readPackagePrice()
    {
        return sharedPreferences.getString("packagePrice","");
    }
    public void  writeUserImage(String userImage)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userImage",userImage);
        editor.apply();
    }

    public String readUserImage()
    {
        return sharedPreferences.getString("userImage","");
    }

    public void  writeUserPhone(String userPhone)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userPhone",userPhone);
        editor.apply();
    }

    public String readUserPhone()
    {
        return sharedPreferences.getString("userPhone","");
    }

    public void  writeUserAddress(String userAddress)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userAddress",userAddress);
        editor.apply();
    }

    public String readUserAddress()
    {
        return sharedPreferences.getString("userAddress","");
    }

    public void  writeTransactionFee(String transactionFee)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("transactionFee",transactionFee);
        editor.apply();
    }

    public String readTransactionFee()
    {
        return sharedPreferences.getString("transactionFee","");
    }

    public void  writeBearToken(String bearToken)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("bearToken",bearToken);
        editor.apply();
    }

    public String readBearToken()
    {
        return sharedPreferences.getString("bearToken","");
    }

    public void  writeUserId(String userId)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userId",userId);
        editor.apply();
    }

    public String readUserId()
    {
        return sharedPreferences.getString("userId","");
    }

    public void  writeUserRole(String userRole)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userRole",userRole);
        editor.apply();
    }

    public String readUserRole()
    {
        return sharedPreferences.getString("userRole","");
    }

    public void  writeUserPackage(String userPackage)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userPackage",userPackage);
        editor.apply();
    }

    public String readUserPackage()
    {
        return sharedPreferences.getString("userPackage","");
    }

    public void  writeUserReferCode(String userRefer)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userRefer",userRefer);
        editor.apply();
    }

    public String readUserReferCode()
    {
        return sharedPreferences.getString("userRefer","0");
    }

    public void  writeUserBalance(String userBalance)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userBalance",userBalance);
        editor.apply();
    }

    public String readUserBalance()
    {
        return sharedPreferences.getString("userBalance","0");
    }

    public void  writeUserName(String userName)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("userName",userName);
        editor.apply();
    }

    public String readUserName()
    {
        return sharedPreferences.getString("userName","");
    }

    public void  writePackageId(String packageId)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("packageId",packageId);
        editor.apply();
    }

    public String readPackageId()
    {
        return sharedPreferences.getString("packageId","");
    }


    //-------------------------------------------------------------//

    public void  writecrCashOut(String crCashOut)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("crCashOut",crCashOut);
        editor.apply();
    }

    public String readcrCashOut()
    {
        return sharedPreferences.getString("crCashOut","");
    }

    public void  writepcCashOut(String pcCashOut)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("pcCashOut",pcCashOut);
        editor.apply();
    }

    public String readpcCashOut()
    {
        return sharedPreferences.getString("pcCashOut","");
    }

    public void  writercCashOut(String rcCashOut)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("rcCashOut",rcCashOut);
        editor.apply();
    }

    public String readrcCashOut()
    {
        return sharedPreferences.getString("rcCashOut","");
    }

    public void  writecrPayment(String crPayment)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("crPayment",crPayment);
        editor.apply();
    }

    public String readcrPayment()
    {
        return sharedPreferences.getString("crPayment","");
    }

    public void  writepcPayment(String pcPayment)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("pcPayment",pcPayment);
        editor.apply();
    }

    public String readpcPayment()
    {
        return sharedPreferences.getString("pcPayment","");
    }

    public void  writercPayment(String rcPayment)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("rcPayment",rcPayment);
        editor.apply();
    }

    public String readrcPayment()
    {
        return sharedPreferences.getString("rcPayment","");
    }

    public void  writecrProduct(String crProduct)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("crProduct",crProduct);
        editor.apply();
    }

    public String readcrProduct()
    {
        return sharedPreferences.getString("crProduct","0");
    }

    public void  writepcProduct(String pcProduct)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("pcProduct",pcProduct);
        editor.apply();
    }

    public String readpcProduct()
    {
        return sharedPreferences.getString("pcProduct","0");
    }

    public void  writercProduct(String rcProduct)
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("rcProduct",rcProduct);
        editor.apply();
    }

    public String readrcProduct()
    {
        return sharedPreferences.getString("rcProduct","");
    }

    public void deleteValue()
    {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(context.getString(R.string.pref_user_name));
        editor.clear();
        editor.apply();
    }
}
