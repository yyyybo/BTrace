package com.xb.trace.conf;

import io.jaegertracing.Configuration;
import io.jaegertracing.samplers.ProbabilisticSampler;
import org.springframework.context.annotation.Bean;

/**
 * JaegerTracerConfig TODO 待完善
 *
 * @author 莫问
 * @date 2019-06-26
 */
@org.springframework.context.annotation.Configuration
public class JaegerTracerConfig {

    @Bean
    public io.opentracing.Tracer jaegerTracer() {
        return new Configuration("spring-boot", new Configuration.SamplerConfiguration(ProbabilisticSampler.TYPE, 1),
            new Configuration.ReporterConfiguration()).getTracer();
    }

}
