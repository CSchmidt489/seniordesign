<<<<<<< HEAD

<<<<<<< HEAD
package com.example.shouter.util;
=======
package com.example.shouter.util;
>>>>>>> branch 'master' of https://github.com/jpha226/seniordesign.git

import java.util.List;

import com.example.shouter.Shout;
<<<<<<< HEAD

public interface ShouterAPIDelegate {
	public List<Shout> onGetShoutReturn(ShouterAPI api, String result, Exception e);
	public void onPostShoutReturn(ShouterAPI api, String result, Exception e);
	public List<Shout> onGetCommentReturn(ShouterAPI api, String result, Exception e);
	public void onPostCommentReturn(ShouterAPI api, String result, Exception e);
}
=======
package com.example.shouter.util;

public interface ShouterAPIDelegate {
	public void onGetShoutReturn(ShouterAPI api, String result, Exception e);
	public void onPostShoutReturn(ShouterAPI api, String result, Exception e);
	public void onGetCommentReturn(ShouterAPI api, String result, Exception e);
	public void onPostCommentReturn(ShouterAPI api, String result, Exception e);
}
>>>>>>> branch 'master' of https://github.com/jpha226/seniordesign.git
=======

public interface ShouterAPIDelegate {
	public List<Shout> onGetShoutReturn(ShouterAPI api, String result, Exception e);
	public void onPostShoutReturn(ShouterAPI api, String result, Exception e);
	public List<Shout> onGetCommentReturn(ShouterAPI api, String result, Exception e);
	public void onPostCommentReturn(ShouterAPI api, String result, Exception e);
}
>>>>>>> branch 'master' of https://github.com/jpha226/seniordesign.git

