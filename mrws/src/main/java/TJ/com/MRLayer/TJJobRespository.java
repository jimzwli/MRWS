package TJ.com.MRLayer;

import java.util.HashMap;

import org.apache.hadoop.mapreduce.Job;

public class TJJobRespository {
	
	private String jobRepositoryName;
	private HashMap<String, Job> jobs = new HashMap<String, Job>();
	
	public TJJobRespository(String name){
		this.jobRepositoryName = name;
	}
	
	
}
