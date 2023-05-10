package com.microservicedeployment.customer;

public record CustomerRegistrationRequest(String firstName, String lastName, String email) {
}
