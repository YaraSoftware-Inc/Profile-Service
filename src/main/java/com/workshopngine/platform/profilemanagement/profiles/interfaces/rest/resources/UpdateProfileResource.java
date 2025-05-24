package com.workshopngine.platform.profilemanagement.profiles.interfaces.rest.resources;

public record UpdateProfileResource(String firstName, String lastName, int dni, String email, int age, String location) {
}
