@RestAPI
Feature: End to End Tests for ToolsQA's Book Store API
  Description: The purpose of tests are to cover end to end happy flows for customer.

  Book Store Swagger URL : https://bookstore.toolsqa.com/swagger/index.html

  Background:  User genearate token for authorisation
    Given I am authorized user
    @RestAPIScnario1
    Scenario: Authorized user is able to Add and Remove a book.
      Given A list of books are available
      When I add a book to my reading list
      Then The book is added
      When I remove a book from my reading list
      Then The book is removed

