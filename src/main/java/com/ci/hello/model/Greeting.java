package com.ci.hello.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Greeting {

    private final String uuid;
    private final String type;
    private final byte[] value;
    private final String attributes;
	private final String workflowStatus;
	private final String systemAttributes;
	private final String usageTickets;

    public Greeting(@JsonProperty("uuid") String uuid,
                    @JsonProperty("type") String type,
                    @JsonProperty("value") byte[] bytes,
                    @JsonProperty("attributes") String attributes,
                    @JsonProperty("workflowStatus") String workflowStatus,
                    @JsonProperty("systemAttributes") String systemAttributes,
                    @JsonProperty("usageTickets") String usageTickets) {
        this.uuid = uuid;
        this.type = type;
        this.value = bytes;
        this.attributes = attributes;
        this.workflowStatus = workflowStatus;
        this.systemAttributes = systemAttributes;
        this.usageTickets = usageTickets;
    }

    public String getUuid() {
        return uuid;
    }

    public String getType() {
        return type;
    }

    public byte[] getValue() {
        return value;
    }

    public String getAttributes() {
        return attributes;
    }

	public String getWorkflowStatus() {
		return workflowStatus;
	}

	public String getSystemAttributes() {
		return systemAttributes;
	}

    public String getUsageTickets() {
        return usageTickets;
    }
    
	public static class Builder {
        private String uuid;
        private String type;
        private byte[] value;
        private String attributes;
		private String workflowStatus;
		private String systemAttributes;
		private String usageTickets;

        public Builder withUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withValue(byte[] value) {
            this.value = value;
            return this;
        }

        public Builder withAttributes(String attributes) {
            this.attributes = attributes;
            return this;
        }

		public Builder withWorkflowStatus(String workflowStatus) {
			this.workflowStatus = workflowStatus;
			return this;
		}

		public Builder withSystemAttributes(String systemAttributes) {
			this.systemAttributes = systemAttributes;
			return this;
		}

        public Builder withUsageTickets(String usageTickets) {
            this.usageTickets = usageTickets;
            return this;
        }

        public Greeting build() {
            return new Greeting(uuid, type, value, attributes, workflowStatus,
                    systemAttributes, usageTickets);
        }
    }
}
