package tests;

public class Path {
    /*
    Log in
    */
    String toMerchCab = "/html/body/j-root/div/j-login/section/j-footer/j-copyright/j-environment-change/div/div[2]/button";
    String emailField = "/html/body/j-root/div/j-jmart-auth-form/section/div/div/section/form/j-input/div/input";
    String passField = "[type=password]";
    String logInBtn = "[type=submit]";

    String jusanLogo = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[1]/j-aside/section[2]/section/section/div";

    /*
    Products_Binding
    */
    String bindSearchField = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[3]/j-search-input/div/input";
    String foundProduct = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[5]/div/j-card-products/div/j-binding-item/div";
    String cross = "[type=button]";
    String list = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[5]";

    // Require clarification
    String reqClarBtn = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[2]/button[2]";
    String linkProd = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[5]/div/j-card-products[1]/div/j-binding-item/div/div[3]/div/div[2]/a[2]";
    String chooseAnotherProd = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[5]/div/j-card-products[2]/div/j-binding-item/div/div[3]/div/div[2]/a[1]";
    String window = "/html/body/ngb-modal-window/div/div/j-binding-modal";
    String recommendedProd = "/html/body/ngb-modal-window/div/div/j-binding-modal/div[2]/div[5]/div[1]";
    String linkProdBtn = "//button[contains(text(),'Связать товар')]";
    // String linkProdBtn = "/html/body/ngb-modal-window/div/div/j-binding-modal/div[3]/div/div[2]/button";

    // Unrecognized
    String unrecognizedBtn = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[2]/button[3]";
    String chooseProd = "/html/body/j-root/div/j-jmart-cabinet-layout/j-layout-home/section[1]/section[2]/j-main/div/section/section/j-jmart-products/section/j-binding-product-page/div[5]/div/j-card-products[1]/div/j-binding-item/div/div[3]/div/div[2]";

    String cancelBtn = "//button[contains(text(),'Отмена')]";
    // String cancelBtn = "/html/body/ngb-modal-window/div/div/j-binding-modal/div[3]/div/div[1]/button";

    String logOutBtn = "//button[contains(text(),'Выход')]";
}
