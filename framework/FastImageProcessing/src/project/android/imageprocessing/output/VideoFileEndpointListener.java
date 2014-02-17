package project.android.imageprocessing.output;

public interface VideoFileEndpointListener {

	//These functions will be called from the Render thread, take care.
	//You should use a handler to get the signal into your main processing thread in the app.
	public void onPhotoTaken(String filepath);
	public void onVideoRecorded(String filepath);

}
