package usace.wat.plugin;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AWSConfig {
	@JsonProperty
	public String aws_config_name;
	@JsonProperty
	public Boolean is_primary_config;
	@JsonProperty
	public String aws_access_key_id;
	@JsonProperty
	public String aws_secret_access_key_id;
	@JsonProperty
	public String aws_region;
	@JsonProperty
	public String aws_bucket;
	@JsonProperty
	public Boolean aws_mock;
	@JsonProperty
	public String aws_endpoint;
	@JsonProperty
	public Boolean aws_disable_ssl;
	@JsonProperty
	public Boolean aws_force_path_style;
}
