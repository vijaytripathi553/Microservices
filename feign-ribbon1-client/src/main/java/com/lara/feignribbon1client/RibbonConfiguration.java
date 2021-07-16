package com.lara.feignribbon1client;
/*
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration;
 * 
 * import com.netflix.client.config.IClientConfig; import
 * com.netflix.loadbalancer.AvailabilityFilteringRule; import
 * com.netflix.loadbalancer.IPing; import com.netflix.loadbalancer.IRule; import
 * com.netflix.loadbalancer.PingUrl;
 * 
 * @Configuration public class RibbonConfiguration {
 * 
 * @Autowired IClientConfig ribbonClient;
 * 
 * @Bean public IPing ping(IClientConfig ribbonClient) { return new PingUrl(); }
 * 
 * @Bean public IRule rule(IClientConfig ribbonClient) { return new
 * AvailabilityFilteringRule(); }
 * 
 * 
 * }
 */




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
public class RibbonConfiguration {
	@Autowired
	IClientConfig ribbonClientConfig;

	@Bean
	public IPing ribbonPing(IClientConfig config) {
		return new PingUrl();
	}

	@Bean
	public IRule ribbonRule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	
}
}

/*
 * IClientConfig: is used to store client configuration.
 * 
– IRule: is used to define load balancing strategy

– IPing: is used to defines the way to ping a server to check if its alive. 

*/
 