package com.alenasoft.urbanager.core.modules;

import com.alenasoft.urbanager.UrbanagerConf;
import com.alenasoft.urbanager.resources.Operations.service.PrimeService;
import com.alenasoft.urbanager.resources.Operations.service.PrimeServiceImpl;
import com.alenasoft.urbanager.resources.example.service.ExampleService;
import com.alenasoft.urbanager.resources.example.service.ExampleServiceImpl;
import com.alenasoft.urbanager.resources.Operations.service.OperationService;
import com.alenasoft.urbanager.resources.Operations.service.OperationServiceImpl;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

/**
 * This class should define the main bindings for dependency injection.
 *
 * @author Luis Roberto Perez
 * @since 20-05-17
 */
public class MainModule extends DropwizardAwareModule<UrbanagerConf> {
  @Override
  protected void configure() {
    bind(ExampleService.class).to(ExampleServiceImpl.class);
    bind(OperationService.class).to(OperationServiceImpl.class);
    bind(PrimeService.class).to(PrimeServiceImpl.class);
  }
}
