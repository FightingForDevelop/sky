package sky.core.interfaces;

import android.support.v4.widget.SwipeRefreshLayout;

/**
 * @author sky
 * @version 版本
 */
public interface SKYRefreshListener extends SwipeRefreshLayout.OnRefreshListener {

	boolean onScrolledToBottom();// 到底部
}