package com.TruckApi.TruckApi.Model;

<<<<<<< HEAD
import lombok.Data;

public @Data class TruckUpdateResponse {

	private String status;
	
=======
import com.TruckApi.TruckApi.Model.TruckRequest.TruckType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TruckUpdateResponse {
	
	
	private String status;
	private String transporterId;
	private String truckId;
>>>>>>> 8033c3454448edc3d4dbe82633cd7fcff8b066a6
}
