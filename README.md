# SwagLabs QA Automation Project

A comprehensive Quality Assurance project for testing the Swag Labs demo e-commerce application using manual testing, UI testing, accessibility testing, API testing, and Selenium-based test automation.

## Project Overview

This project demonstrates a complete QA workflow covering test planning, functional testing, UI validation, accessibility checks, defect management, end-to-end testing, API testing, and web automation.

The project uses the Swag Labs demo application as the main system under test.

## Application Under Test

**Application:** Swag Labs / SauceDemo  
**URL:** https://www.saucedemo.com/

## Testing Scope

The following areas were covered:

- Login and authentication
- Products page
- Product sorting
- Shopping cart
- Checkout
- Order completion
- Logout
- UI validation
- Keyboard accessibility
- Focus visibility
- Form accessibility
- Image accessibility
- Accessibility structure inspection
- End-to-end purchase flow
- API testing
- Selenium automation

## Testing Types

### Manual Testing

Functional test cases were created and executed for:

- Login
- Products
- Sorting
- Cart
- Checkout
- Logout

**Functional Test Result:**

**49 / 49 PASS**

### UI Testing

UI checks covered:

- Login page
- Product page
- Cart page
- Product information presentation
- Buttons and visual elements

**UI Test Result:**

**9 / 10 PASS**

**1 UI defect identified**

### Accessibility Testing

Basic accessibility checks covered:

- Keyboard navigation
- Visible keyboard focus
- Form labels and instructions
- Image accessibility
- Accessibility structure inspection

**Accessibility Test Result:**

**5 / 5 PASS**

### End-to-End Testing

The complete purchase workflow was tested:

```text
Login
  ↓
Products
  ↓
Add Product to Cart
  ↓
Shopping Cart
  ↓
Checkout
  ↓
Enter Customer Details
  ↓
Complete Order
  ↓
Order Confirmation
  ↓
Logout