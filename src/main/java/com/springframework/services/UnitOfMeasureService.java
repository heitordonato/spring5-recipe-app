package com.springframework.services;

import java.util.Set;

import com.springframework.commands.UnitOfMeasureCommand;

public interface UnitOfMeasureService {
	Set<UnitOfMeasureCommand> listAllUoms();
}
