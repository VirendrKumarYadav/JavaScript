

describe("Login to the Inn -Flow",()=>{


beforeEach('Reading login data',()=>{
    cy.fixture('login').then(data=>{
        this.loginData=data;
    })
})
it("Login => ",()=>{
  cy.visit("https://stv2.inn-flow.net/");
  cy.get("input[name='userNameVal']").type(this.loginData.name);
  cy.get("input[name='userPwd']").type("test.123");
  cy.get("button[class='lg-btn action btn btn-primary']").click();
})



})