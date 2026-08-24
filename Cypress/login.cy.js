describe('Demo login page',() =>{
    it ('Should load the page and display login form',() => {
        cy.visit('index.html')
        cy.contains('Welcome to Demo App')
        cy.get('#username').should('be.visible')
        cy.get('#password').should('be.visible')
        cy.get('#submit').should('have.text','Login')
        })

})