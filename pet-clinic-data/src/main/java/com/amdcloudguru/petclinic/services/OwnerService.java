package com.amdcloudguru.petclinic.services;

import com.amdcloudguru.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
