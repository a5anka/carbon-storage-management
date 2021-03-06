package org.wso2.carbon.rssmanager.data.mgt.publisher.util;

import org.wso2.carbon.databridge.agent.thrift.DataPublisher;

public class PublisherManager {
	
	private final DataPublisher publisher;
	private final Key key;
	
	public PublisherManager(final DataPublisher publisher, final Key key) {
	    super();
	    this.publisher = publisher;
	    this.key = key;
    }


	public DataPublisher getPublisher() {
		return publisher;
	}		
	
	public Key getKey() {
		return key;
	}

	public static final class Key{
		private final String definition;
		private final String version;
		
		
		public Key(String definition, String version) {
	        super();
	        this.definition = definition;
	        this.version = version;
        }
		
		public String getDefinition() {
			return definition;
		}
		public String getVersion() {
			return version;
		}

		@Override
        public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + ((definition == null) ? 0 : definition.hashCode());
	        result = prime * result + ((version == null) ? 0 : version.hashCode());
	        return result;
        }

		@Override
        public boolean equals(Object obj) {
	        if (this == obj)
		        return true;
	        if (obj == null)
		        return false;
	        if (getClass() != obj.getClass())
		        return false;
	        Key other = (Key) obj;
	        if (definition == null) {
		        if (other.definition != null)
			        return false;
	        } else if (!definition.equals(other.definition))
		        return false;
	        if (version == null) {
		        if (other.version != null)
			        return false;
	        } else if (!version.equals(other.version))
		        return false;
	        return true;
        }

		@Override
        public String toString() {
	        return "Key [definition=" + definition + ", version=" + version + "]";
        }
		
		
		
		
	}
	

}
