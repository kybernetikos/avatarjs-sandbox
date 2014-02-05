package sandbox.avatarjs;

import java.io.File;

import com.oracle.avatar.js.Server;

public class Main {
	public static void main(String[] args) throws Throwable {
		
		Server.main(new String[] { "js"+File.separator+"example.js" });
		
	}
}
