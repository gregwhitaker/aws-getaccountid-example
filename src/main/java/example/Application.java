package example;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Example application that shows how to get the current AWS account id.
 */
public class Application {
    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    /**
     * Main entry-point of the example.
     *
     * @param args command line arguments
     */
    public static void main(String... args) {
        final Application app = new Application();
        final GetCallerIdentityResult awsCallerIdentity = app.getAwsCallerIdentity();

        LOG.info("Account Id: {}", awsCallerIdentity.getAccount());
        LOG.info("Caller Id: {}", awsCallerIdentity.getUserId());
        LOG.info("Caller Arn: {}", awsCallerIdentity.getArn());
    }

    public Application() { }

    /**
     * Gets the identify of the caller of the AWS api.
     *
     * @return a {@link GetCallerIdentityResult}
     */
    public GetCallerIdentityResult getAwsCallerIdentity() {
        final AWSSecurityTokenService stsService = AWSSecurityTokenServiceClientBuilder.standard().withCredentials(new DefaultAWSCredentialsProviderChain()).build();
        return stsService.getCallerIdentity(new GetCallerIdentityRequest());
    }
}
