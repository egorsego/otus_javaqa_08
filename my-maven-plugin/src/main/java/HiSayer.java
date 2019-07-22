import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhi")
public class HiSayer extends AbstractMojo
{
    public void execute() throws MojoExecutionException
    {
        getLog().info( "Hi" );
    }
}